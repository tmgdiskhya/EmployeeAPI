package com.example.employeeapi.API;

import com.example.employeeapi.Model.Employee;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployeeAPI {
    @GET("employees")
    Call<List<Employee>>getAllEmployees();
}
