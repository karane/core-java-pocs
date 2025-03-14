package org.karane.structural.composite;

public class CompositeExample {
    public static void main(String[] args) {
        // Create individual files
        FileSystemComponent file1 = new FileItem("file1.txt", 10);
        FileSystemComponent file2 = new FileItem("file2.txt", 20);
        FileSystemComponent file3 = new FileItem("file3.txt", 30);
        FileSystemComponent file4 = new FileItem("file4.txt", 40);

        // Create a sub-directory and add a file to it
        Directory subDirectory1 = new Directory("SubDir1");
        subDirectory1.add(file3);

        // Create another sub-directory with nested directories
        Directory subDirectory2 = new Directory("SubDir2");
        subDirectory2.add(file4);
        // Adding a nested sub-directory
        Directory nestedSubDirectory = new Directory("NestedSubDir");
        nestedSubDirectory.add(new FileItem("file_nested.txt", 15));
        subDirectory2.add(nestedSubDirectory);

        // Create the main directory and add files and subdirectories
        Directory mainDirectory = new Directory("MainDir");
        mainDirectory.add(file1);
        mainDirectory.add(file2);
        mainDirectory.add(subDirectory1);
        mainDirectory.add(subDirectory2);

        // Display the file system structure
        mainDirectory.showDetails("");
    }
}
