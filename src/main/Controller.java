package main;

import java.io.File;
import java.util.Arrays;

class Controller {

    private View view;
    private String[] paths = new String[2];

    Controller(View view) {
        paths[0] = "C:\\";
        paths[1] = "D:\\";
        this.view = view;
    }

    void changeDirectory(String path, int whichList){
        paths[whichList] = path;
        getFiles(whichList);
    }

    void start(){
        getFiles(0);
        getFiles(1);
    }

    /**
     * Gets all files in the given paths
     * and updates the view
     */
    private void getFiles(int whichList){
        File folder = new File(paths[whichList]);
        File[] fileList = folder.listFiles();
        if(fileList!=null) {
            fileList = Arrays.stream(fileList).filter(file -> !file.isHidden()).toArray(File[]::new);
        }
        view.displayPath(paths[whichList], whichList);
        view.displayFiles(fileList, whichList);
    }
}
