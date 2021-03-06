package enum_example;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

public class TestApp {

    public static void main(String[] args) {

//        TicketType tType = new TicketType();

        for (TicketType ticketType : TicketType.values()) {
            System.out.println(ticketType.ordinal());
        }

        System.out.println("-------------------------------------");

        for (TicketType ticketType : TicketType.values()) {
            System.out.println(ticketType.getPriority());
        }

        System.out.println("-------------------------------------");

        for (TicketType ticketType : TicketType.values()) {
            System.out.println(ticketType.isAssigned());
        }

        System.out.println("-------------------------------------");

        for (TicketType ticketType : TicketType.values()) {
            ticketType.comment();
        }

        System.out.println("-------------------------------------");

        TicketType bug = TicketType.BUG;
        TicketType suggestion = TicketType.SUGGESTION;

        System.out.println(bug == suggestion);


        TicketType ticketType = TicketType.BUG;
        OtherType otherType = OtherType.FIRST;

//        System.out.println(ticketType == otherType);

        System.out.println("-------------------------------------");

        Set<TicketType> ticketTypeEnumSet = EnumSet.of(TicketType.SUGGESTION, TicketType.BUG);

        for (TicketType type : ticketTypeEnumSet) {
            System.out.println(type.ordinal());
        }

        System.out.println("-------------------------------------");

        Set<TicketType> ticketTypeEnumSet2 = EnumSet.allOf(TicketType.class);

        ticketTypeEnumSet2.forEach(System.out::println);

        System.out.println("-------------------------------------");

        EnumMap<TicketType, String> enumMap = new EnumMap<TicketType, String>(TicketType.class);

        enumMap.put(TicketType.TASK, "Dawid Nowak");
        enumMap.put(TicketType.BUG, "Paweł Cwik");

        System.out.println(enumMap.get(TicketType.BUG));

    }

}
