package com.zf.bean;

import javax.xml.ws.soap.Addressing;

/**
 * @author zhengfan
 * @create 2020-09-25 上午12:57
 *
 *   书名 <input type="text" name="bookName">
 *    作者 <input type="text" name="author">
 *    价格 <input type="text" name="price">
 *    库存 <input type="text" name="stock">
 *    销量 <input type="text" name="sales">
 */
public class Book {

    private  String bookName;

    private  String author;

    private  Double price;

    private  Integer stock;

    private  Integer sales;
    private Address  address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", sales=" + sales +
                ", address=" + address +
                '}';
    }
}
