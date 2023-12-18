
<!doctype html>
<html dir="ltr" lang="en">
<head>
<meta charset="utf-8">
<title>New Tab</title>
<style>
      body {
              background: #FFE0E6;
              margin: 0;
              }

              #backgroundImage {
              border: none;
              height: 100%;
              pointer-events: none;
              position: fixed;
              top: 0;
              visibility: hidden;
              width: 100%;
              }

              [show-background-image] #backgroundImage {
              visibility: visible;
              }
</style>
</head>
<body>
<iframe id="backgroundImage" src="chrome-untrusted://new-tab-page/custom_background_image?url=https%3A%2F%2Flh4.googleusercontent.com%2Fproxy%2FUOhQwfclsAK8TnXZqoTkh9szHvYOJ3auDH07hZBZeVaaRWvzGaXpaYl60MfCRuW_S57gvzBw859pj5Xl2pW_GpfG8k2GhE9LUFNKwA%3Dw3840-h2160-p-k-no-nd-mv"></iframe>
<ntp-app></ntp-app>
<script type="module" src="new_tab_page.js"></script>
<link rel="stylesheet" href="chrome://resources/css/text_defaults_md.css">
<link rel="stylesheet" href="chrome://theme/colors.css?sets=ui,chrome">
<link rel="stylesheet" href="shared_vars.css">
</body>
</html>
