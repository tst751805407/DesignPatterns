package VisitorPattern;



public class ComputerPartDisplayUser implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Hidden Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Hidden Monitor");
    }
}