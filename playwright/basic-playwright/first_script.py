from playwright.sync_api import sync_playwright

with sync_playwright() as playwright:
    ## Mở trình duyệt Chromium
    browser = playwright.chromium.launch(headless=False)  # headless=False để thấy trình duyệt chạy
    page = browser.new_page()  # Mở tab mới
    page.goto("https://www.google.com")  # Điều hướng đến Google
    print(page.title())  # In tiêu đề trang
    browser.close()  # Đóng trình duyệt
