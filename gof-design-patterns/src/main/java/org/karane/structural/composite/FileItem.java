package org.karane.structural.composite;

// Leaf component: File
class FileItem implements FileSystemComponent {
    private String name;
    private int size; // Size in KB

    public FileItem(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "File: " + name + " (" + size + " KB)");
    }
}
