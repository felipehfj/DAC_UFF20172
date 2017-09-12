package br.uff.dac.t1.controleprojetos.servlet;

import br.uff.dac.t1.controleprojetos.modelo.Aluno;
import br.uff.dac.t1.controleprojetos.repository.AlunoRepository;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "alunoservlet")
public class AlunoServlet extends HttpServlet {

    @Inject
    private AlunoRepository alunoRepository;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.append("<HTML>");
        writer.append("<HEAD>");
        writer.append("</HEAD>");
        writer.append("<BODY>");
        for (Aluno aluno: alunoRepository.getAll()) {
            writer.append("<P>");
            writer.append(aluno.getNome());
            writer.append("</P>");
        }
        writer.append("<BODY>");
        writer.append("</HTML>");
    }
}
