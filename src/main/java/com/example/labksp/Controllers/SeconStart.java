package com.example.labksp.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class SeconStart {
    @GetMapping("/json")
    public String returnJson() {

        return "{\n" +"  \"id\": \"1\",\n"+
                "  \"name\": \"Бильярд\",\n" +
                "  \"description\": \"Как можно не любить такой вид спорта, занимаясь которым можно не потеть и потягивать прохладный коктейль? Достаточно старинная игра, корни которой уходят в Азию (ну или в Индию — все вечно спорят). Запомни эти слова — пока играть не научишься как следует, сможешь хоть щеголять познаниями в этой теме.\",\n" +
                "  \"category\": \"Развлечение\",\n" +
                "  \"images\": [\n" +
                "    \"https://images.unsplash.com/photo-1575553939928-d03b21323afe?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80\",\n"+ "\"https://images.unsplash.com/photo-1519176570115-8b6ccb4b5448?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1100&q=60\",\n" + "\"https://images.unsplash.com/photo-1534463868211-1203a5c900a9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1100&q=60\"\n" +
                "  ],\n" +
                "  \"difficulty\": \"2\",\n" +
                "  \"guide\": \"Первое и самое важное — постановка правильного удара. Эта нудная работа над собой отнимает много времени и сил, но она совершенно необходима для того, чтобы прилично играть в бильярд. После того как игрок достигает какого-то прогресса в технике (например, стабильно собирает линейку из 15 шаров), для него наступает пора занятом «продвинутой» техникой: остановкой битка, накатом, оттяжкой, боковиками и заинтересоваться позиционной игрой. В процессе игры крайне важно не забывать о технике. В этом случае, применяя на практике накаты и оттяжки, начинающий бильярдист сможет значительно улучшить свою технику, постичь не очевидные с первого взгляда нюансы и значительно поднять игру. Третий этап: тактическая игра, понятие отыгрыша, система бортов, специфические удары («дуговики», перескоки и т. п). На этом уровне весь новый технический арсенал должен отрабатываться в сочетании с правильным подходом к каждому удару. Примечательно, что после того как ученик овладел практически всей теорией, он возвращается к тому, с чего начинал: совершенствует технику. Ведущие инструкторы EFPB Дэвид Альфьере и Уве Сандер считают, что «большинство ошибок, которые игрок этого уровня все еще допускает, обусловлены недостаточно отработанной техникой и редко случаются по причине отсутствия теоретических знаний».\",\n" +
                "  \"guideVideo\": [\n" +
                "    \"WdfRqrOszeA\",\n" +
                "    \"WEn-SOAJXwg\"\n" +
                "  ],\n" +
                "  \"exercise\": [\n" +
                "    \" Отработка игровой стойки. Поставьте на стол шар на расстоянии полуметра от борта и, в соответствии с описанием в разделе Техника игры, отрабатывайте подход к столу и постановку стойки.\",\n" +
                "    \"2) Упражнение с бутылкой. Положите на стол пустую пластиковую бутылку без пробки (желательно, объемом 1 литр) и встаньте в стойку, как будто горлышко бутылки есть центр шара и бить Вы собираетесь в направлении дна бутылки. Делайте ударные и возвратные движения кием внутрь бутылки так, чтобы не задевать ее.\",\n" +
                "    \"3) Отработка ударно-маховых движений. Встаньте в стойку так, как будто собираетесь забить шар в среднюю лузу (шар при этом не используется), делайте разминочные движения кием, а потом ударное движение. Следите за тем, чтобы кий все время смотрел в середину лузы, а также чтобы движения были плавными.\"\n" +

                "  ]\n" +
                "}";
    }
    @GetMapping("/json123")
    public String returnJson123() {

        return "{\n" +
                "  \"id\": \"3\",\n" +
                "  \"login\": \"koksana@ya.ru\",\n" +
                "  \"password\":\"12345\",\n" +
                "  \"displayName\":\"Оксана\",\n" +
                "  \"position\":\"Москва\",\n" +
                "  \"userLevel\":\"Новичок\",\n" +
                "  \"challengeCount\":\"9\",\n" +
                "  \"profilePicture\":\"https://99px.ru/sstorage/53/2018/03/mid_222779_572804.jpg\",\n" +
                "  \"lastChallenge\":{\"id\": \"1\",\n" +
                "                  \"name\": \"Рисование акварелью\",\n" +
                "                  \"image\": \n" +
                "                    \"https://images.unsplash.com/photo-1476763752342-d5cf7e5eb6cc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1100&q=60\"\n" +
                "                 ,\n" +
                "                  \"difficulty\": \"2\"},\n" +
                "  \"lastAchievement\":{\"id\": \"1\",\n" +
                "                  \"name\": \"Пабло Пикассо\",\n" +
                "                  \"image\": \n"  +
                "                    \"https://emojipedia-us.s3.dualstack.us-west-1.amazonaws.com/thumbs/160/twitter/233/female-artist-type-3_1f469-1f3fc-200d-1f3a8.png\"\n"  +
                "                  ,\n" +
                "                  \"description\": \"Выполнен Челлендж из категории Творчество.\"\n}" +
                "}"
                ;
    }
}