package br.com.paulocordeiro.swapi.model;

import java.util.List;

/**
 * SwapiResult to enclose Swapi response
 * @param <T>
 */
public class SwapiResult<T> {
    int count;
    String next;
    String previous;
    List<T> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
