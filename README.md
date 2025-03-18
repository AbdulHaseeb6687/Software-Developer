# Software-Developer
<h2>SDA Assignment</h2>

<h1>https://drive.google.com/file/d/1J_z6BlpB2xk7KpszVxu8V2A28XqWvMo6/view?usp=drive_link</h1>

This project demonstrates two approaches to implementing payment processing: No Protected Variation and Protected Variation. In the No Protected Variation approach, the BasicTransactionHandler directly references specific payment classes and uses conditional statements to determine which payment method to execute, making it less flexible and harder to extend. On the other hand, the Protected Variation approach follows the Open-Closed Principle by using an interface (PaymentMethod) and concrete implementations (CreditCardPayment, PayPalPayment, BitcoinPayment), allowing for easier modification and extension without changing existing code. The Protected Variation design ensures better maintainability and scalability by using polymorphism, making it preferable for real-world applications.
