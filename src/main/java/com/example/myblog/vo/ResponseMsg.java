package com.example.myblog.vo;

public class ResponseMsg<T> {
  private ResponseHead head;
  private T data;

  public ResponseHead getHead() {
    return head;
  }

  public void setHead(ResponseHead head) {
    this.head = head;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

}
