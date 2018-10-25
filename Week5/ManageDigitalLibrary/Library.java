package ManageDigitalLibrary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    public static List<MediaEntity> listOfAllMedia = new ArrayList<>();

    public List<MediaEntity> myTop20() {
        List<MediaEntity> top20 = new ArrayList<>();
        Collections.sort(listOfAllMedia);
        if (listOfAllMedia.size() < 20) {
            top20 = listOfAllMedia;
        }else {
            for(int i=0; i<20; i++) {
                top20.add(listOfAllMedia.get(i));
            }
        }
        return top20;
    }

    public List<MediaEntity> myArchive(){
        List<MediaEntity> archive = new ArrayList<>();
        Collections.sort(listOfAllMedia);
        if (listOfAllMedia.size() < 20) {
            System.out.println("Arhive is empty");
            archive = null;
        } else {
            for (int i = 20; i < listOfAllMedia.size(); i++) {
                archive.add(listOfAllMedia.get(i));
            }
        }
        return archive;
    }

    public void addMedia(MediaEntity m){
        this.listOfAllMedia.add(m);
    }


    public List<MediaEntity> searchMedia(Object t){
       List<MediaEntity> srcList = new ArrayList<>();
       for(MediaEntity m: listOfAllMedia){
           if(m.getType().equals(t)){
               srcList.add(m);
           }else if(m.getTitle().equals(t)){
               srcList.add(m);
           }else if(m.getNoOfDownloads().equals(t)){
               srcList.add(m);
           }else if(m.equals(t)){
               srcList.add(m);
           }
       }
       if(srcList.size() == 0){
           System.out.println("Media not found!");
       }
        return srcList;
    }

    public void printLib(){
       for(MediaEntity m: listOfAllMedia){
           System.out.println(m.toString());
       }
    }

    public void print(List<MediaEntity> lst){
        for(MediaEntity m: lst){
            System.out.println(m.toString());
        }
    }

    public void updateNoOfDownloads(MediaEntity m, int n){
       m.setNoOfDownloads(m.getNoOfDownloads() + n);
    }
}
