package com.example.myblog.controller;

import com.example.myblog.vo.ResponseHead;
import com.example.myblog.vo.ResponseMsg;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class MyControllerAdvice {
  /**
   * 全局异常捕捉处理
   *
   * @param ex
   * @return
   */
  @ResponseBody
  @ExceptionHandler(value = Exception.class)
  public ResponseMsg errorHandler(Exception ex) {
    final ResponseMsg response = new ResponseMsg();
    final ResponseHead rspHead = new ResponseHead();
    rspHead.setRespStatus("01");
    rspHead.setRespCode("01");
    rspHead.setRespDesc(ex.getMessage());
    response.setHead(rspHead);
    return response;
  }

  /**
   * 拦截捕捉运行时异常 RuntimeException.class
   *
   * @param ex
   * @return
   */
  @ResponseBody
  @ExceptionHandler(value = RuntimeException.class)
  public ResponseMsg myErrorHandler(RuntimeException ex) {
    final ResponseMsg response = new ResponseMsg();
    final ResponseHead rspHead = new ResponseHead();
    rspHead.setRespStatus("01");
    rspHead.setRespCode("01");
    rspHead.setRespDesc("请求处理失败：" + ex.getMessage());
    response.setHead(rspHead);
    return response;
  }
}
