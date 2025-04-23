package Controllers;

import Models.Book;

public class BookController {
    public void sortByName(Book[] libros){
        int n = libros.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int aux = ;
                libros[j + 1] = libros[j];
                libros[j + 1] = aux;
            }
        }
    }

    public Book searchByName(Book[] libros, String nombre){
        int n = libros.length;
        if(libros == null || libros.length <= 1){
            return null;
        }
        for(int i = 1; i < n; i++){
            Book aux = libros[i];
            int j  = i - 1;
            while (j >= 0 && libros[j + 1].getYear() > aux.getYear()) {
                libros[j + 1] = libros[j];
                j--;
            }
            libros[j + 1] = aux;
        }

        return null;
    } 
}