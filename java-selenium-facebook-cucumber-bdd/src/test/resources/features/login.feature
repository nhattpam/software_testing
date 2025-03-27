#Feature: Facebook Login Functionality

#  Scenario: Đăng nhập thành công vào Facebook
#    Given Người dùng mở trang đăng nhập Facebook
#    When Nhập username "your-email@example.com" và password "yourpassword"
#    And Nhấn nút Login
#    Then Hệ thống hiển thị trang chủ Facebook

Feature: Facebook Login Functionality

  Scenario: Đăng nhập thành công vào Facebook
    Given Người dùng mở trang đăng nhập Facebook
    When Nhập username và password từ file config
    And Nhấn nút Login
    Then Hệ thống hiển thị trang chủ Facebook
