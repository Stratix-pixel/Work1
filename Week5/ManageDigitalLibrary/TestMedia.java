package ManageDigitalLibrary;

public class TestMedia {
    public static void main(String[] args){
        MediaEntity v1 = new Video("video","Video1",34,5,false);
        MediaEntity v2 = new Video("video","Video2",53,1,true);
        MediaEntity v3 = new Video("video","Video3",13,2,true);
        MediaEntity v4 = new Video("video","Video4",77,6,false);
        MediaEntity v5 = new Video("video","Video5",543,7,true);

        MediaEntity m1 = new Mp3("mp3","Music1",45,"artist1","Album1");
        MediaEntity m2 = new Mp3("mp3","Music2",43,"artist2","Album2");
        MediaEntity m3 = new Mp3("mp3","Music3",14,"artist3","Album3");
        MediaEntity m4 = new Mp3("mp3","Music4",12,"artist4","Album4");
        MediaEntity m5 = new Mp3("mp3","Music5",67,"artist5","Album5");
        MediaEntity m6 = new Mp3("mp3","Music6",88,"artist6","Album6");
        MediaEntity m7 = new Mp3("mp3","Music7",3,"artist7","Album7");

        MediaEntity b1 = new Book("book","Book1",13,"author1","Edit1");
        MediaEntity b2 = new Book("book","Book2",7,"author2","Edit1");
        MediaEntity b3 = new Book("book","Book3",9,"author3","Edit1");
        MediaEntity b4 = new Book("book","Book4",83,"author4","Edit1");
        MediaEntity b5 = new Book("book","Book5",37,"author5","Edit1");
        MediaEntity b6 = new Book("book","Book6",19,"author6","Edit1");
        MediaEntity b7 = new Book("book","Book7",23,"author7","Edit1");
        MediaEntity b8 = new Book("book","Book8",45,"author8","Edit1");
        MediaEntity b9 = new Book("book","Book9",156,"author9","Edit1");
        MediaEntity b10 = new Book("book","Book10",95,"author10","Edit1");
        MediaEntity b11 = new Book("book","Book11",67,"author11","Edit1");
        MediaEntity b12 = new Book("book","Book12",43,"author12","Edit1");
        MediaEntity b13 = new Book("book","Book13",76,"author13","Edit1");
        MediaEntity b14 = new Book("book","Book14",4,"author14","Edit1");
        MediaEntity b15 = new Book("book","Book15",2,"author15","Edit1");


        Library lib = new Library();
        lib.addMedia(b1);
        lib.addMedia(b2);
        lib.addMedia(b3);
        lib.addMedia(b4);
        lib.addMedia(b5);
        lib.addMedia(b6);
        lib.addMedia(b7);
        lib.addMedia(b8);
        lib.addMedia(b9);
        lib.addMedia(b10);
        lib.addMedia(b11);
        lib.addMedia(b12);
        lib.addMedia(b13);
        lib.addMedia(b14);
        lib.addMedia(b15);

        lib.addMedia(v1);
        lib.addMedia(v2);
        lib.addMedia(v3);
        lib.addMedia(v4);
        lib.addMedia(v5);

        lib.addMedia(m1);
        lib.addMedia(m2);
        lib.addMedia(m3);
        lib.addMedia(m4);
        lib.addMedia(m5);
        lib.addMedia(m6);
        lib.addMedia(m7);

        System.out.println("List of all media: ");
        lib.printLib();

        System.out.print("\n");
        System.out.println("Display all media entities that are of type video: ");
        lib.print(lib.searchMedia("video"));

        System.out.print("\n");
        System.out.println("Update noOfDownloads field for Video3 with 4 (Current noOfDownloads=" + v3.getNoOfDownloads()+ "):");
        lib.updateNoOfDownloads(v3,4);
        lib.print(lib.searchMedia("Video3"));

        System.out.print("\n");
        System.out.println("Display all the top20 most accessed media entities: ");
        lib.print(lib.myTop20());

        System.out.print("\n");
        System.out.println("Adding a new Media Entity of type video and searching it by name: ");
        MediaEntity v6 = new Video("video","MyVideo",1567,11,true);
        lib.addMedia(v6);
        lib.print(lib.searchMedia(v6));

        System.out.print("\n");
        System.out.println("The updated top20: ");
        lib.print(lib.myTop20());

        System.out.print("\n");
        System.out.println("Display archived media entities:");
        lib.print(lib.myArchive());
    }
}
