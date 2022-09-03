import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        String[] arrName = {"Asan", "Bermet", "Uson", "Samat", "Salkyn", "Rahat", "Seytek", "", "Ruslan", "Jyldyz", "Munar"};
        int[] arrAge = {20,21,-22,23,24,25,26,27,28,29,30};
        int k = 0;
        for (int i = 0; i < arrName.length; i++) {
            try {
                if (i == 4) {
                    students.add(null);
                    if (students.get(k) == null) {
                        throw new NullPointerException("ArrayList element cannot be null");
                    }
                } else if (i == 10) {
                    students.get(11);
                    throw new IndexOutOfBoundsException();
                } else {
                    students.add(new Student(arrName[i], arrAge[i]));
                }
                System.out.print(students.get(k));
                k++;
            } catch (MyException me) {
                System.out.print("My exception: " + me.getMessage());
            } catch (NullPointerException npe) {
                System.out.print(npe.getMessage());
                k++;
            } catch (IndexOutOfBoundsException ie) {
                System.out.print("Index is out of bound");
            }
            finally {
                System.out.println("<-->");
            }
        }
        System.out.println("The program is over");
    }
}