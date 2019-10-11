package com.example.myblog.commont;

import com.example.myblog.vo.ResponseHead;
import com.example.myblog.vo.ResponseMsg;
import org.springframework.http.HttpStatus;


public class MyblogConvert {
    /**
     * 隐藏公共构造函数
     */
    private MyblogConvert() {
        throw new IllegalStateException("MyblogConvert class");
    }

    /**
     * 统一返回respones
     *
     * @param data
     * @return
     */
    public static ResponseMsg getReponse(boolean flag,Object data,String code,String msg) {
        ResponseMsg responseMsg = new ResponseMsg();
        ResponseHead responseHead = new ResponseHead();
        responseMsg.setData(data);
        responseHead.setRespCode(code);
        responseHead.setRespDesc(msg);
        responseHead.setRespStatus(HttpStatus.OK.toString());
        responseHead.setFlag(flag);
        responseMsg.setHead(responseHead);
        return responseMsg;
    }
}
