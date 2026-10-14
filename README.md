# Dictionary

An English-Russian dictionary for Android. It looks up word translations through the public
[Skyeng Dictionary](https://dictionary.skyeng.ru/) API, shows the transcription,
translation variants and an image, and stores search history and favorite words
in a local database.

## Features

- Word search online and in the local database
- Word card: translation, transcription, note, image
- Favorites and search history (available offline)
- Handling of missing network connection

## Tech stack

| Area           | Technologies                                 |
|----------------|----------------------------------------------|
| Language       | Kotlin                                       |
| Architecture   | MVVM, Repository / Interactor                |
| DI             | Koin                                         |
| Concurrency    | Kotlin Coroutines                            |
| Networking     | Retrofit, OkHttp, Gson                       |
| Storage        | Room                                         |
| Images         | Glide                                        |
| UI             | ViewBinding, Material Components             |
| Build          | Gradle Kotlin DSL, dependencies in `buildSrc`|

## Project structure

```
app/src/main/java/com/tlenparty/dictionary/
├── api/            # Retrofit interface for the Skyeng API
├── base_logic/     # Activity and fragments: search, details, favorites
├── data/
│   ├── db/         # Room: entities and DAOs
│   ├── entities/   # API response models
│   ├── interactors/
│   └── repositories/
├── di/             # Koin modules
├── states/         # screen states (Loading / Success / Error)
└── viewmodel/
buildSrc/           # versions and dependencies (Kotlin DSL)
```

## Build

Requires JDK 11–17 and Android SDK 31.

```bash
./gradlew assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`.
