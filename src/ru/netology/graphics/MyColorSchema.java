package ru.netology.graphics;

import ru.netology.graphics.image.TextColorSchema;

public class MyColorSchema implements TextColorSchema{
// определяем массив символов, 8 шт.

    private char [] schema = { '#', '$', '@', '%', '*', '+', '-', '\'', ' '};
// масштабируем 255 цветов к комбинации 8 символов. // Для использования в классе MyConverter в цикле, где конвертируется графика в символы.

    public char convert(int color) {
        return schema[color / (255 / 8)];
    }
}