package com.example.myblog.vo;

import lombok.Data;

@Data
public class ResponseHead {
  private String requestId;
  private String respStatus;
  private String respCode;
  private String respDesc;
  private boolean flag;

}
