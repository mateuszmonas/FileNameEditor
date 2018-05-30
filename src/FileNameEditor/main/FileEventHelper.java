package FileNameEditor.main;

import java.io.File;
import java.util.List;

import FileNameEditor.nodes.FileNodeSelectable;

public interface FileEventHelper {

        void deleteFilesEvent(int whichList);
        void moveFilesToTrash(int whichList);
        void pasteFilesFromClipboardEvent(int whichList);
        void cutFilesEvent(int whichList);
        void moveFilesEvent(List<File> files, String path);
        void moveFilesEvent(List<File> files, int whichList);
        void copyFilesToClipboardEvent(int whichList);
        void createNewFile(String fileName, int whichList);
        void renameFile(FileNodeSelectable node, int whichList);

}


