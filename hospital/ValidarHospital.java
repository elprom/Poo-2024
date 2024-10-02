package hospital;

import consultas.Consulta;

import java.util.ArrayList;

public class ValidarHospital {

    ArrayList<Consulta> listaConsultas = new ArrayList<>();

    // Metodos validar consulta
    public boolean validarDisponibilidadFechaConsulta(int idPaciente, String fechaDeseada, int numeroConsultorio, ArrayList<Consulta> listaConsultas) {
        for (Consulta consulta : listaConsultas) {
            // No exista una consulta en la fecha y consultorio deseado
            if (!consulta.getFechaHora().equals(fechaDeseada) && numeroConsultorio == consulta.getConsultorio().numeroConsultorio) {
                System.out.println("Ya existe una consulta registrada");
                return false;
            }
        }
        return true;
    }

    public boolean validarDisponibilidadMedico(String fechaDeseada, int idMedico, ArrayList<Consulta> listaConsultas) {
        for (Consulta consulta : listaConsultas) {
            if (consulta.getFechaHora().equals(fechaDeseada) && consulta.getMedico().getId() == idMedico) {
                return false;
            }
        }
        return true;
    }


}
