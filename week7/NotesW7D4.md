Accessibility and Android
-

---

### What?

- Accessibility addresses helping those who have medical disabilities. 
- This involves universal design

---

### How?

- Screen Readers
- Captions
- Visual Ques
- Different Modes

---

### Types to Consider

- Visual
    - Color Blind Mode
    - Text-To-Speech
    - Haptic Feedback
    - Text Magnification
- Motor 
    - Large Buttons
    - Extended Timers
    - setFocus() on labels
    - android:labelFor
- Auditory
    - Captions
    - Transcription
- Cognitive 
    - Fonts for Dyslexia
- Speech
    - Text Input
    - Buttons

---

### XML

- For ImageView, add content descriptions, so screen readers can find it
- android:contentDescription = "@null"

---

### Copy

- Copy is the content on the page
- Copy Features:
    - Localized
    - Concise
    - Descriptive (verbs > nouns)

---

### Typography

- Ensure it's readable
- Do not use fontSize < 12sp
- Use fonts with heavier weight
- Avoid centered text
- Avoid All-Caps because readers will think it's an abbreviation

---

### Color

- Have strong contrast ratios

---

### Reference

- Hacking Digital Styleguides for Accessibility

---

### Traversal

- accessibilityTraversalBefore

---

### Delegates

---

### Tools

- Talkback
- Brailback
- Lookout
- Magnifier
- AAA Contrast 

---

Firebase / Cloud Storage
-

---

### Login

- Single Sign-On
    - Tied to Social Media
    - #1 Method Today
- Username and Password
    - Store and Compare
    - Causes many passwords to be generated
- ID Service / Authentication Tokens (Okta, KeyCloack [host your own identity service], Azure [Microsoft] Services, etc.)
    - 3 pieces = Identity Server, Authorization Token, Receiving Server