package org.karane.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite component: Directory
class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Directory: " + name);
        // Increase indent for nested components
        for (FileSystemComponent component : components) {
            component.showDetails(indent + "    ");
        }
    }
}
