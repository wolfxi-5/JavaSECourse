package package01;

import java.util.Scanner;

public class Notebook {
    String[] notes = new String[100];
    int count = 0;

    public void addNote(String s) {
        notes[count] = s;
        count++;
    }

    public String geyNote(int i) {
        return notes[i-1];
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(notes[i]);
        }
    }

    public int getCount() {
        return count;
    }

    public void removeNote(int n) {
        if(n > 0 && n <= count && count > 0) {
            for (int i = n; i < count; i++) {
                notes[i-1] = notes[i];
            }
            count--;
            System.out.println("delete successfully!");
        }
        else {
            System.out.println("wrong!");
        }
    }

    public static void main(String[] args) {
        Notebook note = new Notebook();
        int num = 0;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("please input your note:");
            //String s = in.nextLine();
            String s = in.next();
            note.addNote(s);

            System.out.println("do you still want to input?");
            System.out.println("1.yes 0.no");
            num = in.nextInt();
        }while(num == 1);

        System.out.println("===========");
        note.showAll();
        System.out.println("===========");

        Scanner in2 = new Scanner(System.in);
        System.out.println("you want to find:");
        int i = in2.nextInt();
        System.out.println(note.geyNote(i));
        System.out.println("you want to delete:");
        i = in2.nextInt();
        note.removeNote(i);

        System.out.println("===========");
        note.showAll();
        System.out.println("===========");
    }
}
