package com.a_liutarovich.gifsearcher.Models;

public class Pagination {

    private String total_count;
    private String count;
    private String offset;

    public String getTotal_count() {
        return total_count;
    }

    public void setTotal_count(String total_count) {
        this.total_count = total_count;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "Pagination{" +
                "total_count='" + total_count + '\'' +
                ", count='" + count + '\'' +
                ", offset='" + offset + '\'' +
                '}';
    }
}