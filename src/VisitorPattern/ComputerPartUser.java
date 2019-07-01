package VisitorPattern;

import javax.management.monitor.Monitor;

public interface ComputerPartUser {
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}