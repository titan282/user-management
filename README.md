# user-management

### Cấu trúc thư mục
![image](https://user-images.githubusercontent.com/67032039/180124479-1f6965ff-ed1b-41bf-be6c-3b1cf2d6758b.png)

- Trong src code sẽ có Controller dùng để xử lý các request, các API group:

### 1. GET /users
 - Trong Controller ta sẽ nhận request chuyển đến Service xử lý lấy Entity từ DB chuyển ra thành DTO và trả về kết quả
 ![image](https://user-images.githubusercontent.com/67032039/180123747-7e733e58-45e2-45e8-b585-8a6dba295f59.png)
 - Service                        
 ![image](https://user-images.githubusercontent.com/67032039/180124213-ef0a3df6-db21-4aa6-b7d5-e3d079762709.png)
![image](https://user-images.githubusercontent.com/67032039/180124881-0ef3b85f-983c-4540-bcef-5f562b53c798.png)

### 2. GET /users/{id}
![image](https://user-images.githubusercontent.com/67032039/180124947-b98cf2a0-91ba-41ef-989a-dacdf14b7487.png)
![image](https://user-images.githubusercontent.com/67032039/180125181-6c49b2b2-74e1-471b-b860-c9f484f98758.png)

### 3. GET /user/search?name=.. (SearchUserByName)
![image](https://user-images.githubusercontent.com/67032039/180125100-fc0ff0c6-524d-44bc-af83-45cd964330fa.png)
![image](https://user-images.githubusercontent.com/67032039/180125222-47f06018-260a-41cf-b6e4-0235610d2e05.png)

### 4. Xử lý Exception
- Tạo một class **ErrorRespond** chứa các **field** muốn trả về        
![image](https://user-images.githubusercontent.com/67032039/180133794-c91c33f4-1d84-4476-890d-75d9956ddeb7.png)
![image](https://user-images.githubusercontent.com/67032039/180153492-853ca490-b6af-4183-b8e6-b9aff16710d1.png)
- Tạo một class **UserNotFoundException** extends **RuntimeException** để thể hiện nó là một Exception có đầu vào là message truyền vào 
![image](https://user-images.githubusercontent.com/67032039/180154236-982fb6fb-263f-4e91-bda7-da8879054de7.png)
- Class **CustomExceptionHandler** để xử lý Exception khi được gặp, khi gặp Exception này thì nó sẽ thực hiện **function** được định nghĩa
![image](https://user-images.githubusercontent.com/67032039/180154736-5ce8de44-10d3-4dec-97ed-62c0ebcd5199.png)
