import { chromium, test } from "@playwright/test"
import { asyncWrapProviders } from "async_hooks";

test("login test demo", async () => {
    const browser =  await chromium.launch({
        headless: false
    });
    const context = await browser.newContext();
    const page = await context.newPage();

    await page.goto("https://ecommerce-playground.lambdatest.io/");
    await page.hover("//a[@data-toggle='dropdown']//span[contains(.,'My account')]");
    // await page.click("text=Login");
    await page.click("'Login'");

    await page.fill("input[name='email']", "koushik350@gmail.com");
    await page.fill("input[name='password']", "Pass123$");
    await page.click("input[value='Login']");

    await page.waitForTimeout(5000);

    const newContext = await browser.newContext();

    const newPage = await newContext.newPage();
    await newPage.goto("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");

    await newPage.waitForTimeout(5000);

})