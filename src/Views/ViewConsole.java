package Views;

import Models.Book;

public class ViewConsole { 
    public void imprimirArray(Book[] books){
        int n = books.length;
        for(int i = 0; i < n; i++){
            System.out.print(books[i] + "  ||  ");
            System.out.print("   ");
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}