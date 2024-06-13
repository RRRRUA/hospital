package org.example.tijian.util;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * 统一返回对象Result
 *
 * @author gugu
 * @since 2024-06-13 11:37:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 186793288401863732L;
    private Integer code; //状态码, 1成功, 0失败
    private T Data;
    private String message;

    // 成功的静态方法
    public static <T> Result<T> success(T data) {
        return new Result<>(1, data, null);
    }

    public static <T> Result<T> success() {
        return new Result<>(1, null, null);
    }

    // 失败的静态方法
    public static <T> Result<T> error(String message) {
        return new Result<>(0, null, message);
    }
}

