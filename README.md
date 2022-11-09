RestFull API архитектура.

RestFull API архитектура - это архитектура клиент-серверного приложения базирующаяся на 6 принципах.

1. Универсальный интерфейс взаимодействия. (Uniform Interface)

2. Запросы без состояния. (Stateless)

3. Поддержка кеширования. (Cacheable)

4. Клиент-серверная ориентация.

5. Поддержка слоев (Layered System)

6. Возможность выполнять код на стороне клиента (Code on Demand)

HTTP протокол.

Весь принцип REST архитектуры базируется на протоколе HTTP. Поэтому в этом протоколе нужно хорошо разобраться.

Сообщение протокола состоит из двух частей Header, Body.

Header - содержит информацию об запросе и ответе, тип отправляемой информации, размере, возможности кешировать запрос.

Body - содержит данные сообщения. В протоколе можно передавать: текст, картинки, файлы.

HTTP methods.

Все запросы используют указания на методы. По сути они говорят серверу, что нужно сделать.

1. GET - используется для получение данных. Не должен изменять данные на сервере.

2. HEAD - аналогично GET. но не содержит тела ответа.

3. POST - используется для изменения данных на сервера.

4. PUT - аналог POST.

5. DELETE - удаляет данные с сервера. Не содержит тела ответа.

6. CONNECT - проверяет соединение с сервером.

7. OPTIONS - используется для получения информации о сервере.

8. TRACE - используется для тестирования соединения с дополнительной информацией.

HTTP Status.

Каждый HTTP запрос возвращает ответ с HTTP Status. Этот ответ сообщает клиенту. что произошло с сервером.

Их можно разделить на 5 групп:

1XX - информационные. например. 101 - переключение протокола с http на https
2XX - запрос выполнен на сервере успешно.
3XX - запрос был перенаправлен на другой URI.
4XX - ошибки, связанные с клиентом. Например, 403 - у клиента нет доступа к серверу.
5XX - ошибки, связанные с сервером. 500 - сервер упал.