package com.example.myblog.vo;

import javax.validation.Valid;

public class RequestMsg<T> {
  private RequestHead head;
  @Valid
  private T data;

  public RequestHead getHead() {
    return head;
  }

  public void setHead(RequestHead head) {
    this.head = head;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

}
