package VisitorPattern;

import VisitorPattern.ComputerPart;
import VisitorPattern.ComputerPartVisitor;

public class Mouse  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}