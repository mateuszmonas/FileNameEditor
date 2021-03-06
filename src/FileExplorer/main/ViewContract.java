package FileExplorer.main;

import java.io.File;
import java.util.List;

public interface ViewContract {

    interface Model {
        void start(Controller controller, DialogHelper dialogHelper);

        void cutFiles(List<File> files);

        void deleteFiles(List<File> files);

        void moveFiles(List<File> files, int whichList);

        void moveFiles(List<File> files, String path);

        void copyFilesToClipboard(List<File> files);

        void pasteFilesFromClipboard(int whichList);

        void moveFilesToTrash(List<File> files);

        void enterDirectory(String path, int whichList);

        void goToParentDirectory(int whichList);

        void createFile(String name, int whichList);

        void renameFile(File oldFile, String newName);

        void renameFile(String oldName, String newName, int whichList);

        void getFiles();
    }

    interface Controller {
        void displayPath(String path, int whichList);

        void displayFiles(File[] files, int whichList);
    }

}
