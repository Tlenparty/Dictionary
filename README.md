# Dictionary

Англо-русский словарь для Android. Ищет перевод слова через публичный API
[Skyeng Dictionary](https://dictionary.skyeng.ru/), показывает транскрипцию,
варианты перевода и картинку, сохраняет историю поиска и избранные слова
в локальной базе.

## Возможности

- Поиск слова онлайн и в локальной базе
- Карточка слова: перевод, транскрипция, заметка, изображение
- Избранное и история поиска (работают офлайн)
- Обработка отсутствия сети

## Стек

| Область        | Технологии                                   |
|----------------|----------------------------------------------|
| Язык           | Kotlin                                       |
| Архитектура    | MVVM, Repository / Interactor                |
| DI             | Koin                                         |
| Асинхронность  | Kotlin Coroutines                            |
| Сеть           | Retrofit, OkHttp, Gson                       |
| Хранение       | Room                                         |
| Изображения    | Glide                                        |
| UI             | ViewBinding, Material Components             |
| Сборка         | Gradle Kotlin DSL, зависимости в `buildSrc`  |

## Структура

```
app/src/main/java/com/tlenparty/dictionary/
├── api/            # Retrofit-интерфейс Skyeng API
├── base_logic/     # Activity и фрагменты: поиск, детали, избранное
├── data/
│   ├── db/         # Room: сущности и DAO
│   ├── entities/   # модели ответа API
│   ├── interactors/
│   └── repositories/
├── di/             # Koin-модули
├── states/         # состояния экранов (Loading / Success / Error)
└── viewmodel/
buildSrc/           # версии и зависимости (Kotlin DSL)
```

## Сборка

Требуется JDK 11–17 и Android SDK 31.

```bash
./gradlew assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`.
