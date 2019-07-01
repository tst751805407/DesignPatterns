package VisitorPattern;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        System.out.println("电脑全局管理员展示");
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
        System.out.println("~~~~~~~~~~~~~");
        System.out.println("电脑用户展示");
        computer.accept(new ComputerPartDisplayUser());
    }
}
