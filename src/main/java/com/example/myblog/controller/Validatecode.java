package com.example.myblog.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 验证码
 *
 * @author ch
 *
 */
@RestController
public class Validatecode {

  @RequestMapping(value = "/validatecode", produces = MediaType.IMAGE_PNG_VALUE)
  public @ResponseBody byte[] generate(HttpServletResponse response, HttpServletRequest request) {
    final ByteArrayOutputStream output = new ByteArrayOutputStream();
    final String code = drawImg(output);
    final String id = request.getSession().getId();
    final String key = id + System.currentTimeMillis();
    final Cookie cookie = new Cookie("key", key);
    cookie.setMaxAge(60 * 30);
    response.addCookie(cookie);
    // request.getSession().setAttribute("captchaCode", code);
    return output.toByteArray();
  }

  /**
   * 绘画验证码
   *
   * @param output
   * @return
   */
  private String drawImg(ByteArrayOutputStream output) {
    String code = "";
    // 随机产生4个字符
    for (int i = 0; i < 4; i++) {
      code += randomChar();
    }
    final int width = 120;
    final int height = 25;
    final BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
    final Font font = new Font("Times New Roman", Font.PLAIN, 20);
    // 调用Graphics2D绘画验证码
    final Graphics2D g = bi.createGraphics();
    g.setFont(font);
    final Color color = new Color(255, 255, 255);
    g.setColor(color);
    g.setBackground(new Color(45, 45, 45));
    g.clearRect(0, 0, width, height);
    final FontRenderContext context = g.getFontRenderContext();
    final Rectangle2D bounds = font.getStringBounds(code, context);
    final double x = (width - bounds.getWidth()) / 2;
    final double y = (height - bounds.getHeight()) / 2;
    final double ascent = bounds.getY();
    final double baseY = y - ascent;
    g.drawString(code, (int) x, (int) baseY);
    g.dispose();
    try {
      ImageIO.write(bi, "png", output);
    } catch (final IOException e) {
      e.printStackTrace();
    }
    return code;
  }

  /**
   * 随机参数一个字符
   *
   * @return
   */
  private char randomChar() {
    final Random r = new Random();
    final String s = "ABCDEFGHJKLMNPRSTUVWXYZ0123456789";
    return s.charAt(r.nextInt(s.length()));
  }
}
