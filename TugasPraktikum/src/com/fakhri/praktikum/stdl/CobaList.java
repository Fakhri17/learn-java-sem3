package com.fakhri.praktikum.stdl;
import java.util.ArrayList;
import java.util.List;

public class CobaList {
    public static void main(String[] args) {
        // Declare and initiate new ArrayList object
        List<String> blackpinkMembers = new ArrayList<String>();

        // Add 4 new members
        blackpinkMembers.add("Lisa");
        blackpinkMembers.add("Jennie");
        blackpinkMembers.add("Rose");
        blackpinkMembers.add("Jisoo");

        // For each member in blackpinkMembers, print member
        System.out.println("All members:");
        blackpinkMembers.forEach(System.out::println);

        // Remove member in blackpinkMembers if member is "Jennie"
        blackpinkMembers.removeIf(member -> member.equals("Jennie"));

        // For each member in blackpinkMembers, print member
        System.out.println("All members after removed Jennie:");
        blackpinkMembers.forEach(System.out::println);

        // Add Jennie in blackpinkMembers again
        blackpinkMembers.add("Jennie");

        // Ascending-sort based on Unicode value
        blackpinkMembers.sort(String::compareTo);

        // For each member in blackpinkMembers, print member
        System.out.println("All members after sorted:");
        blackpinkMembers.forEach(System.out::println);

        // Descending-sort based on Unicode value
        blackpinkMembers.sort((member1, member2) -> member2.compareTo(member1));

        // For each member in blackpinkMembers, print member
        System.out.println("All members after sorted descending:");
        blackpinkMembers.forEach(System.out::println);

        // Remove all members from blackpinkMembers
        blackpinkMembers.removeAll(blackpinkMembers);

        // For each member in blackpinkMembers, print member
        System.out.println("All members after removed:");
        blackpinkMembers.forEach(System.out::println);
    }
}
