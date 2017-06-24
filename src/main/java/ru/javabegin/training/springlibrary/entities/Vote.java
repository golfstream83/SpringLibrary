package ru.javabegin.training.springlibrary.entities;

/**
 * @author Viktor Tulin
 * @version 1
 * @since 24.06.2017
 */
public class Vote {
    private long id;
    private Integer value;
    private long bookId;
    private String username;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vote vote = (Vote) o;

        if (id != vote.id) return false;
        if (bookId != vote.bookId) return false;
        if (value != null ? !value.equals(vote.value) : vote.value != null) return false;
        if (username != null ? !username.equals(vote.username) : vote.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (int) (bookId ^ (bookId >>> 32));
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}
