package control;

/**
 * Clase que contiene las coordenadas de cada casilla de los tablero que se
 * usaran para mover las fichas alrededor de estos, estas coordendas varian
 * segun el tamaño del tablero seleccionado.
 *
 * @author Luis Gonzalo Cervantes Rivera 00000228549 Gabriel Francisco Piñuelas
 * Ramos 00000230626 Ricardo Pacheco Urias 00000229178 Abraham Sered Gómez
 * Martínez 00000228796
 */
public class MoverFichaJ1 {

    int num = 0;
    private final int casillasChica[][] = {
        {432, 449},
        {467, 421},
        {498, 454},
        {527, 485},
        {556, 520},
        {586, 550},
        {621, 580},
        {658, 542},
        {626, 512},
        {593, 483},
        {563, 451},
        {533, 422},
        {499, 389},
        {533, 360},
        {564, 331},
        {597, 298},
        {627, 267},
        {662, 231},
        {629, 200},
        {590, 235},
        {561, 264},
        {529, 297},
        {498, 328},
        {466, 357},
        {434, 329},
        {400, 299},
        {369, 268},
        {337, 238},
        {300, 204},
        {268, 236},
        {304, 271},
        {335, 303},
        {365, 335},
        {396, 365},
        {432, 392},
        {398, 419},
        {366, 451},
        {336, 480},
        {303, 514},
        {269, 547},
        {302, 583},
        {340, 544},
        {372, 512},
        {401, 482}
    };

    private final int casillasMediana[][] = {
        {432, 449},
        {467, 421},
        {498, 454},
        {528, 488},
        {560, 519},
        {592, 553},
        {624, 584},
        {657, 614},
        {691, 581},
        {660, 550},
        {628, 518},
        {595, 483},
        {563, 451},
        {533, 422},
        {499, 389},
        {533, 360},
        {564, 331},
        {597, 298},
        {630, 266},
        {659, 235},
        {697, 199},
        {664, 169},
        {627, 202},
        {597, 230},
        {561, 267},
        {529, 297},
        {498, 328},
        {466, 357},
        {434, 329},
        {399, 300},
        {369, 268},
        {339, 236},
        {306, 205},
        {268, 176},
        {236, 204},
        {271, 240},
        {305, 267},
        {335, 299},
        {368, 331},
        {400, 364},
        {432, 392},
        {398, 419},
        {366, 451},
        {336, 480},
        {303, 514},
        {273, 543},
        {236, 580},
        {269, 615},
        {307, 578},
        {336, 549},
        {368, 516},
        {404, 481}
    };

    private final int casillasGrande[][] = {
        {432, 449},
        {467, 421},
        {498, 454},
        {528, 488},
        {558, 521},
        {593, 553},
        {628, 584},
        {660, 613},
        {691, 648},
        {720, 617},
        {693, 581},
        {662, 550},
        {627, 519},
        {596, 484},
        {564, 455},
        {534, 422},
        {498, 391},
        {534, 362},
        {565, 331},
        {596, 300},
        {630, 266},
        {663, 233},
        {691, 205},
        {729, 169},
        {696, 135},
        {659, 170},
        {629, 198},
        {597, 232},
        {565, 265},
        {534, 297},
        {501, 328},
        {468, 357},
        {432, 331},
        {401, 300},
        {369, 267},
        {335, 234},
        {304, 201},
        {273, 172},
        {235, 139},
        {201, 170},
        {241, 204},
        {271, 237},
        {303, 266},
        {336, 300},
        {368, 333},
        {400, 363},
        {435, 390},
        {398, 419},
        {367, 452},
        {335, 484},
        {303, 516},
        {270, 550},
        {241, 577},
        {204, 617},
        {237, 649},
        {273, 613},
        {304, 582},
        {336, 551},
        {369, 517},
        {401, 485}
    };

}
