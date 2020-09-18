package com.powernode.handle;


import com.powernode.exception.ResultException;
import com.powernode.util.Result;
import com.powernode.util.ResultEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ActivityHandele {

    @ExceptionHandler(value = ResultException.class)
    @ResponseBody
    public Result activityHandele(Exception e) {
        ResultException resultException = null;
        if (e instanceof ResultException) {
            resultException = (ResultException) e;
            return Result.build(resultException);
        }else{
            return Result.build(new ResultException(ResultEnum.UNKNOWN_EXCEPTION));
        }

    }

}
