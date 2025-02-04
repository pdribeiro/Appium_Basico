# Guia de Instalação e Configuração

## Instalação

Para configurar o ambiente de desenvolvimento para automação de testes no Android, siga os passos abaixo:

### 1. Android Studio e Java
Baixe e instale o [Android Studio](https://developer.android.com/studio?hl=pt-br) e garanta que o Java esteja instalado.

### 2. Node.js
Instale o Node.js a partir do seguinte link: [Node.js Download](https://nodejs.org/pt-br/download/).

### 3. Appium
Instale o Appium seguindo as instruções oficiais: [Guia de Instalação do Appium](https://appium.io/docs/en/about-appium/getting-started/).

### 4. Appium Desktop
Baixe o Appium Desktop na página oficial do GitHub: [Appium Desktop Releases](https://github.com/appium/appium-desktop/releases/).

### 5. Appium Doctor
Instale o Appium Doctor para verificar se todas as dependências estão corretamente instaladas: [Appium Doctor](https://www.npmjs.com/package/appium-doctor).

### 6. Java Kit 8
Baixe e instale o Java Development Kit 8 (JDK 8): [Download do JDK 8](https://www.oracle.com/br/java/technologies/javase-downloads.html).

---

## Configuração do Dispositivo

Para iniciar a automação, é necessário configurar corretamente o dispositivo.

### 1. Json de Configuração do Emulador
Se estiver usando um emulador, utilize o seguinte arquivo JSON para a configuração:

```json
{
  "app": "C:\\Users\\PICHAU\\Downloads\\app-debug.apk\\app-debug.apk",
  "platformName": "android",
  "platformVersion": "10",
  "deviceName": "Pixel 4 API 29"
}
```

### 2. Dispositivo Físico
Caso utilize um dispositivo físico, siga os passos abaixo:

#### a) Listar dispositivos conectados
Para listar os dispositivos conectados ao computador, execute o seguinte comando no terminal:

```sh
adb devices -l
```

#### b) Configuração das Capabilities
Use as seguintes capabilities para configurar um dispositivo físico:

```json
{
  "app": "/Users/asdfasf/Documents/app-debug.apk",
  "platformName": "android",
  "platformVersion": "11",
  "udid": "asdfasfd",
  "appPackage": "com.example.myapplication10",
  "appActivity": "com.example.myapplication10.MainActivity",
  "deviceName": "Redmi_Note_8"
}
```

Com esses passos, seu ambiente de automação estará pronto para execução!

