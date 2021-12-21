# Тесты-кейсы сайта demo-deal.ig.com

##### Егор Мороз. ФИТ БГТУ

---

# #1 Рыночная покупка акций компании
### Предусловие
Открыта главная страница сайта demo-deal.ig.com<br>
Есть средства на покупку акций

| Шаг | Ожидаемый результат |
| --- | ------------------- |
| Выбираем пункт Indices в боковом меню сайта | Открытие выпадающего меню |
| Нажать кнопку "Add to workspace" | Меню добавлена на рабочую область |
| Выбрать пункт интересующей валюты | Открытие графика изменения цен на валюту |
| Смена периода отчетности графика | Показ графика за интересующий период времени |
| Закрыть график | График пропадает с рабочей области |

# #2 Покупка акций
### Предусловие
Открыта главная страница сайта demo-deal.ig.com <br>
Есть акции, которые можно продать

| Шаг | Ожидаемый результат |
| --- | ------------------- |
| Выбираем пункт Indices в боковом меню сайта | Открытие выпадающего меню                |
| Нажать кнопку "Add to workspace"            | Меню добавлена на рабочую область        |
| Выбрать пункт интересующей валюты           | Открытие графика изменения цен на валюту |
| Нажать на кнопку "Купить" | Переход в режим покупки |
| Ввести количество товара | Расчет стоимости |
| Нажать на кнопку "Подтвердить" | Списание баланса, покупка валюты |

# #3 Продажа акций
### Предусловие
Открыта страница сайта demo-deal.ig.com<br>
продажа акций

| Шаг | Ожидаемый результат |
| --- | ------------------- |
| Выбираем пункт Indices в боковом меню сайта | Открытие выпадающего меню                |
| Нажать кнопку "Add to workspace"            | Меню добавлена на рабочую область        |
| Выбрать пункт интересующей валюты           | Открытие графика изменения цен на валюту |
| Нажать на кнопку "Продать"                  | Переход в режим продажи                  |
| Ввести количество товара                    | Расчет прибыли                           |
| Нажать на кнопку "Подтвердить"              | Пополнение баланса, пополнение баланса   |

# #4 Создание и удаление списка наблюдения
### Предусловие
Открыта страница сайта demo-deal.ig.com<br>
Есть средства на покупку акций

| Шаг | Ожидаемый результат |
| --- | ------------------- |
| Выбрать пункт СПИСКИ НАБЛЮДЕНИЯ в боковом меню сайта         | Открытие выпадающего меню                                    |
| Выбрать пункт "Создать список наблюдения"                    | Требуется ввод имени списка наблюдения для его создания      |
| Ввод имени списка наблюдения                                 | Создание списка наблюдения. Открытие нового списка наблюдения с отображением его имени |
| Открыть пункт СПИСКИ НАБЛЮДЕНИЯ в боковом меню сайта         | Открывается страница созданных списков наблюдения            |
| Нажать правой кнопкой мыши по имени созданного списка наблюдения, и выбрать пункт "Удалить список наблюдения" в контекстном меню | Список наблюдения удален                                     |

# #5 Добавление элемента в список наблюдения
### Предусловие
Открыта страница сайта demo-deal.ig.com<br>

| Шаг | Ожидаемый результат |
| --- | ------------------- |
| Выбрать пункт СПИСКИ НАБЛЮДЕНИЯ в боковом меню сайта         | Открытие выпадающего меню                                    |
| Выбрать пункт "Создать список наблюдения"                    | Требуется ввод имени списка наблюдения для его создания      |
| Ввод имени списка наблюдения                                 | Создание списка наблюдения. Открытие нового списка наблюдения с отображением его имени |
| Открыть пункт "Индексы" в боковом меню                       | Открытие меню с выбором индекса                              |
| Нажать правой кнопкой мыши по интересующему индексу, выбрать пункт "Добавить в список просмотра" | Добавление индекса в список наблюдения                       |

# #6 Отображение информации о выбранном товаре
### Предусловие
Открыта страница сайта demo-deal.ig.com<br>
Есть средства на покупку акций

| Шаг | Ожидаемый результат |
| --- | ------------------- |
| Открыть пункт "Сырьевые товары" в боковом меню сайта | Открытие меню с выбором товара |
| В меню с выбором товара выбрать интересующий | Открытие графика с отчетностью о изменении товара за определенный период времени |
| Выбрать пункт "новости и аналитика" под графиком | Открытие всплывающего меню с датой событий о выбранном товаре |
| Во всплывающем меня с датой событий о выбранном товаре выбрать интересующее событие | Открытие окна с информацией о выбранном событии              |

# #7 Отображение информации о изменении выбранного товара
### Предусловие
Открыта страница сайта demo-deal.ig.com<br>
Есть акции, которые можно продать

| Шаг | Ожидаемый результат |
| --- | ------------------- |
| Открыть пункт "Цифровые 100" | Открытие меню с выбором товара                               |
| Установить галочку в чекбоксе интересующего типа | Отображение информации о выбранном типе в виде меню справа   |
| Выбрать один из пунктов меню                     | Открытие графика с отчетностью о изменении товара за определенный период времени |
| Установить галочку еще в одном чекбоксе          | В меню о выбранных типах появилась дополнительная информация о добавленном типе |

# #8 Добавление и удаления оповещения о акциях
### Предусловие
Открыта страница сайта demo-deal.ig.com<br>
Есть средства на покупку акций

| Шаг | Ожидаемый результат |
| --- | ------------------- |
| Выбрать пункт "Акции" в боковом меню сайта                   | Открытие меню с выбором акции                                |
| Выбрать интересующую акцию                                   | Открытие графика с отчетностью о изменении товара за определенный период времени |
| Нажать на пункт "Установить оповещение"                      | Оповещение установлено                                       |
| Выбрать пункт "Оповещения" в боковом меню сайта              | Открытие окна с с акциями на которые было установлено оповещение |
| Выбрать пункт "Удалить" справа от акции на которую установлено оповещение | Оповещение на выбранную акцию удалено                        |

# #9 Отображение новостей о бирже
### Предусловие
Открыта страница сайта demo-deal.ig.com<br>

| Шаг | Ожидаемый результат |
| --- | ------------------- |
| Выбрать пункт "Новости и аналитика"                    | Открытие окна с новостями                              |
| Открыть интересующую новость                           | Открытие нового окна с информацией о выбранной новости |
| Выбрать пункт "Открыть в новом окне"                   | Новость открывается в новом окне браузера              |
| В пункте "Новости и аналитика" выбрать Главные новости | Открывается окно с главными новостями                  |
| Нажать на крестик в правой верхней части окна          | Раздел с новостями закрывается                         |

# #10 Информация о экономическом календаре
### Предусловие
Открыта страница сайта demo-deal.ig.com<br>

| Шаг | Ожидаемый результат |
| --- | ------------------- |
| Выбрать пункт "Экон Календарь"                               | В новом окне открывается экономический календарь |
| В главном меню выбрать графу смены языка и сменить язык на русский | Язык календаря изменен на русский                |
| На главной странице календаря в главном меню выбрать пункт "О компании" | Открытие окна с информацией о компании           |
| Нажать на логотип сайта возле главного меню                  | Возвращение на главную страницу календаря        |
