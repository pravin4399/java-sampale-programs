public class ClassMonitor extends Student {

    public void monitorClass() {
        System.out.println("Monitor is monitoring in class");
    }

    public ClassMonitor(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void commute() {
        super.commute();

    }

    @Override
    public void doStudy(String subject) {
        super.doStudy(subject);
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void doStudy() {
        super.doStudy();
    }
    @Override
    ClassMonitor studentDetails(){
        return this;
    }
}


