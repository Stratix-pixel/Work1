package week9.wordprocessor.refactored;

import java.io.*;

public class WordProcessor
{

    public static final int MAX_LINE_LENGTH = 60;

    public void wordWrap3( String input, String output ) throws IOException
    {
        File inputFile = new File( input );
        File outputFile = new File( output );

        wordWrap3( new FileReader( inputFile ), new FileWriter( outputFile ) );
    }

    public void wordWrap3( Reader input, Writer output ) throws IOException
    {
        try( BufferedReader br = new BufferedReader( input );
             BufferedWriter bw = new BufferedWriter( output ); )
        {
            String line;

            while( (line = br.readLine( )) != null )
            {
                StringBuilder lineBuilder = new StringBuilder( line );

                while( lineBuilder.length( ) > MAX_LINE_LENGTH )
                {
                    bw.write( getNextWrappedLine( lineBuilder ) );
                    bw.newLine( );
                }

                bw.write( lineBuilder.toString() );
            }
        }
    }

    private int getCutoffIndex( StringBuilder line )
    {
        int lastSpaceIndex = line.substring( 0, MAX_LINE_LENGTH + 1 ).lastIndexOf( " " );
        boolean spaceNotFound = lastSpaceIndex == -1;

        return spaceNotFound ? MAX_LINE_LENGTH : lastSpaceIndex;
    }

    private String getNextWrappedLine( StringBuilder lineBuilder )
    {
        int cutoffIndex = getCutoffIndex( lineBuilder );

        String line = lineBuilder.substring( 0, cutoffIndex );

        lineBuilder.delete( 0, cutoffIndex + 1 );

        return line;
    }
}
