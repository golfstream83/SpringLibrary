package ru.javabegin.training.springlibrary.entities;

import java.util.Arrays;


public class Book implements java.io.Serializable {

    private Long id;
    private Author author;
    private Genre genre;
    private Publisher publisher;
    private String name;
    private byte[] content;
    private Integer pageCount;
    private String isbn;
    private Integer publishYear;
    private byte[] image;
    private String descr;
    private Integer rating;
    private Long voteCount;

    public Book() {
    }


    public Book(Long id, Author author, Genre genre, Publisher publisher, String name, byte[] content, Integer pageCount, String isbn, Integer publishYear, byte[] image, String descr, Integer rating, Long voteCount) {
        this.id = id;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.name = name;
        this.content = content;
        this.pageCount = pageCount;
        this.isbn = isbn;
        this.publishYear = publishYear;
        this.image = image;
        this.descr = descr;
        this.rating = rating;
        this.voteCount = voteCount;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return this.content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Integer getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    public byte[] getImage() {
        return this.image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescr() {
        return this.descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Long getVoteCount() {
        return this.voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (!author.equals(book.author)) return false;
        if (!Arrays.equals(content, book.content)) return false;
        if (!descr.equals(book.descr)) return false;
        if (!genre.equals(book.genre)) return false;
        if (!id.equals(book.id)) return false;
        if (!Arrays.equals(image, book.image)) return false;
        if (!isbn.equals(book.isbn)) return false;
        if (!name.equals(book.name)) return false;
        if (!pageCount.equals(book.pageCount)) return false;
        if (!publishYear.equals(book.publishYear)) return false;
        if (!publisher.equals(book.publisher)) return false;
        if (!rating.equals(book.rating)) return false;
        if (!voteCount.equals(book.voteCount)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + genre.hashCode();
        result = 31 * result + publisher.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + Arrays.hashCode(content);
        result = 31 * result + pageCount.hashCode();
        result = 31 * result + isbn.hashCode();
        result = 31 * result + publishYear.hashCode();
        result = 31 * result + Arrays.hashCode(image);
        result = 31 * result + descr.hashCode();
        result = 31 * result + rating.hashCode();
        result = 31 * result + voteCount.hashCode();
        return result;
    }
}
