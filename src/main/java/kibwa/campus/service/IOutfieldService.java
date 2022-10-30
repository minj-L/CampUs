package kibwa.campus.service;

import kibwa.campus.dto.BoardDTO;
import kibwa.campus.dto.OutfieldDTO;

import java.util.List;

public interface IOutfieldService {
    List<OutfieldDTO> getOutfieldList() throws Exception;
    OutfieldDTO getOudfieldView(OutfieldDTO oDTO) throws Exception;
    void insertOutfield(OutfieldDTO oDTO) throws Exception;
    void updateOutfield(OutfieldDTO oDTO) throws Exception;
}
