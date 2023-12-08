package ch03;

public class Cleaner implements IElectronic110V{

    @Override
    public void connect() {
        System.out.println("청소기 연결 110V ON");
    }
}
