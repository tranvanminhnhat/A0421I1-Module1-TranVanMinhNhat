<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 06/12/2021
  Time: 7:58 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tờ khai báo y tế</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h2 style="text-align: center">TỜ KHAI Y TẾ</h2>
<h4 style="text-align: center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Ý TẾ LIÊN LẠC</h4>
<p style="text-align: center; color: red;">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử
    lý hình sự</p>
<form style="padding: 30px;">
    <div class="form-row">
        <div class="form-group col-md-12">
            <label><strong>Họ tên (ghi chữ IN HOA)</strong></label><br>
            <input type="text" class="form-control">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-4">
            <label><strong>Năm sinh</strong></label>
            <select class="form-control">
                <option selected>2000</option>
                <option>1999</option>
                <option>1998</option>
                <option>1997</option>
                <option>1996</option>
                <option>1995</option>
                <option>1994</option>
                <option>1993</option>
                <option>1992</option>
                <option>1991</option>
                <option>1990</option>
            </select>
        </div>
        <div class="form-group col-md-4">
            <label><strong>Giới tính</strong></label>
            <select class="form-control">
                <option selected>Nam</option>
                <option>Nữ</option>
                <option>Khác</option>
            </select>
        </div>
        <div class="form-group col-md-4">
            <label><strong>Quốc Tịch</strong></label>
            <select class="form-control">
                <option selected>Vietnam</option>
                <option>America</option>
                <option>Japan</option>
                <option>China</option>
            </select>
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-12">
            <label><strong>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</strong></label><br>
            <input type="text" class="form-control">
        </div>
    </div>
    <label><strong>Thông tin đi lại</strong></label>
    <div class="form-row">
        <div class="form-check" style="display: inline; margin-left: 15px;">
            <input class="form-check-input" type="radio" name="flexRadioDefault">
            <label class="form-check-label">
                Tàu bay
            </label>
        </div>
        <div class="form-check" style="display: inline; margin-left: 15px;">
            <input class="form-check-input" type="radio" name="flexRadioDefault" checked>
            <label class="form-check-label">
                Tàu thuyền
            </label>
        </div>
        <div class="form-check" style="display: inline; margin-left: 15px;">
            <input class="form-check-input" type="radio" name="flexRadioDefault" checked>
            <label class="form-check-label">
                Ô tô
            </label>
        </div>
        <div class="form-check" style="display: inline; margin-left: 15px;">
            <input class="form-check-input" type="radio" name="flexRadioDefault" checked>
            <label class="form-check-label">
                Khác
            </label>
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label><strong>Số hiệu phương tiện</strong></label><br>
            <input type="text" class="form-control">
        </div>
        <div class="form-group col-md-6">
            <label><strong>Số ghế</strong></label><br>
            <input type="text" class="form-control">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label><strong>Ngày khởi hành</strong></label>
        </div>
        <div class="form-group col-md-6">
            <label><strong>Ngày kết thúc</strong></label>
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-2">
            <select class="form-control">
                <option selected>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
                <option>11</option>
                <option>12</option>
                <option>13</option>
                <option>14</option>
            </select>
        </div>
        <div class="form-group col-md-2">
            <select class="form-control">
                <option selected>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
                <option>11</option>
                <option>12</option>
            </select>
        </div>
        <div class="form-group col-md-2">
            <select class="form-control">
                <option selected>2016</option>
                <option>2017</option>
                <option>2018</option>
                <option>2019</option>
                <option>2020</option>
                <option>2021</option>
            </select>
        </div>
        <div class="form-group col-md-2">
            <select class="form-control">
                <option selected>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
                <option>11</option>
                <option>12</option>
                <option>13</option>
                <option>14</option>
            </select>
        </div>
        <div class="form-group col-md-2">
            <select class="form-control">
                <option selected>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
                <option>11</option>
                <option>12</option>
            </select>
        </div>
        <div class="form-group col-md-2">
            <select class="form-control">
                <option selected>2016</option>
                <option>2017</option>
                <option>2018</option>
                <option>2019</option>
                <option>2020</option>
                <option>2021</option>
            </select>
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-12">
            <label><strong>Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh/thành phố nào?</strong></label><br>
            <input type="text" class="form-control">
        </div>
    </div>
    <label><strong>Địa chỉ liên lạc</strong></label>
    <div class="form-row">
        <div class="form-group col-md-4">
            <label><strong>Tỉnh/Thành</strong></label>
            <select class="form-control">
                <option selected>Quảng Nam</option>
                <option>Đà Nẵng</option>
                <option>Quảng Ngãi</option>
                <option>Huế</option>
                <option>Quảng Trị</option>
                <option>Quảng Bình</option>
            </select>
        </div>
        <div class="form-group col-md-4">
            <label><strong>Quận/Huyện</strong></label>
            <select class="form-control">
                <option selected>Nam Giang</option>
                <option>Trà My</option>
                <option>Thăng Bình</option>
            </select>
        </div>
        <div class="form-group col-md-4">
            <label><strong>Phường/Xã</strong></label>
            <select class="form-control">
                <option selected>Phước Hòa</option>
                <option>Hòa Xuân</option>
                <option>Hòa Quý</option>
                <option>Bình Minh</option>
            </select>
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-12">
            <label><strong>Địa chỉ nơi ở</strong></label><br>
            <input type="text" class="form-control">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label><strong>Điện thoại</strong></label><br>
            <input type="text" class="form-control">
        </div>
        <div class="form-group col-md-6">
            <label><strong>Email</strong></label><br>
            <input type="text" class="form-control">
        </div>
    </div>
    <p style="color: red;">Dữ liệu bạn cung cấp hoàn toàn bảo mật và chỉ phục vụ cho việc phòng chống dịch, thuộc quản lý của Ban chỉ đạo
        quốc gia về Phòng chống dịch Covid-19.</p>
    <p style="color: red;">Khi bạn nhấn nút "Gủi" là bạn đã hiểu và đồng ý.</p>
    <div style="text-align: center;">
        <button type="submit" class="btn btn-success" style="border-radius: 20px;">Gửi tờ khai</button>
    </div>
</form>
</body>
</html>
