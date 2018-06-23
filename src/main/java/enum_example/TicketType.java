package enum_example;

public enum TicketType implements Commented {

    BUG("high"),
    TASK("medium"){
        @Override
        public boolean isAssigned() {
            return true;
        }
        @Override
        public void comment() {
            System.out.println("Comment for a task");
        }
    },
    SUGGESTION("low");

    private String priority;

    TicketType(String priority) {
        this.priority = priority;
    }

    public boolean isAssigned() {
        return false;
    }

    public void comment() {
        System.out.println("Standard comment");
    }

    public String getPriority() {
        return priority;
    }

}
