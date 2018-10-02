package com.a_liutarovich.gifsearcher.Models;

import com.a_liutarovich.gifsearcher.Models.Data;
import com.a_liutarovich.gifsearcher.Models.Meta;
import com.a_liutarovich.gifsearcher.Models.Pagination;

import java.util.List;

public class Gifs {

    private List<Data> data;
    private Meta meta;
    private Pagination pagination;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @Override
    public String toString() {
        return "Gifs{" +
                "data=" + data +
                ", meta=" + meta +
                ", pagination=" + pagination +
                '}';
    }
}